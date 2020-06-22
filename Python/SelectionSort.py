# time complexity of O(n^2)

arr = [2, 8, 5, 3, 9, 4, 1]

def swap(array, idx0, idx1):
    temp = array[idx0]
    array[idx0] = array[idx1]
    array[idx1] = temp
    return array

def selection_sort(arr):
    for c_min in range(len(arr)):
        for index in range(c_min+1, len(arr)):
            if arr[index] < arr[c_min]:
                arr = swap(arr, index, c_min)
    return arr

print(selection_sort(arr))
