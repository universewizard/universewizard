def binsearch(array, item, low, high):
    if low>high:
        return -999
    mid = int((low+high)/2)
    if item==array[mid]:
        return mid
    elif item<array[mid]:
        high=mid-1
        return binsearch(array, item, low, high)
    else:
        low=mid+1
        return binsearch(array, item, low, high)

array=[]
length=int(input("Enter the length of list: "))
for i in range(0,length):
    a=int(input("Enter the element"))
    array.append(a)
print("The list is: ",array)
item=int(input("Enter the item to be searched for: "))
result=binsearch(array, item, 0, len(array)-1)
if result>0:
        print("Element found at: ",result)
else:
    print("The element does not exist in the array")
