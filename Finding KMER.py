original_sequence="AAGCCGCG"
likmers=[]
original_usequence=original_sequence.upper()
k=int(input("Enter the size of kmer"))
for i in range(0,len(original_usequence)-k+1):
    kmer = original_usequence[i:i+k]
    likmers.append(kmer)
print("The original requence is: ",original_sequence)
