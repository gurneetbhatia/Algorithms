def swap(array, idx0, idx1):
    temp = array[idx0]
    array[idx0] = array[idx1]
    array[idx1] = temp
    return array


arr = [9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0]

for i in range(1, len(arr)):
    j = i
    while j > 0 and arr[j-1] > arr[j]:
        arr = swap(arr, j, j-1)
        j -= 1

print(arr)
