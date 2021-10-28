import numpy as np
from numpy import mean, std, cov, array
from numpy.linalg import eig

#dummy data for PCA
x = array([[1,2],[3,4],[5,6],[7,8],[9,10],[11,12]])
print(x)

#Calculate the mean of each column
means = mean(x.T, axis = 1)
print('Mean: ',means)

#Subtract colum means from r=each value for a new mean of 0
center = x - means
print(center)

#Calculate standard deviation
dev = std(x.T, axis = 1)
print(dev)

#Divide the centered data by standard deviation to finish standardization process
standard = center/dev
print('Standard deviation: ',standard)

#Calculate the variance covariance matrix of the standardized data
covariance = cov(standard.T)
print('Covariance matrix: ',covariance)

#Get eigenvalues and eigenvectors by eigendecomposition of covariance
values, vectors = eig(covariance)
print('Eigenvalues: ', values)
print('Eigenvectors: ',vectors)

#Data projection
project = vectors.T.dot(standard.T)
print(project.T)

#Principal componenets
principal = vectors.T.dot(standard.T)
print('Principal componenets: ',principal.T)

#Plot
import matplotlib.pyplot as plt1

x = array([1,3,5,7,9])
y = array([2,4,6,8,10])
plt1.scatter(x,y)
plt1.title('Data before PCA')
plt1.show()


import matplotlib.pyplot as plt2
pc1 = principal.T[:,0]
pc2 = principal.T[:,1]

plt1.scatter(pc1, pc2)
plt1.title('Data after PCA')
plt1.show()

