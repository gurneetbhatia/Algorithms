def swap(array, idx0, idx1):
    temp = array[idx0]
    array[idx0] = array[idx1]
    array[idx1] = temp
    return array



arr = [9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0]

counter = 1

for _ in range(0, len(arr)-1):
    for j in range(0, len(arr)-counter):
        if arr[j+1] < arr[j]:
            arr = swap(arr, j, j+1)
    counter += 1

print(arr)
