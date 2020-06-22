arr = [9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0]

def merge(a, b):
    c = []
    while (len(a) > 0 and len(b) > 0):
        if(a[0] > b[0]):
            # add b[0] to end of c and remove it from b
            c.append(b[0])
            b = b[1:]
        else:
            # add a[0] to the end of c and remove it from a
            c.append(a[0])
            a = a[1:]
    # either a or b is empty at this point
    while(len(a) > 0):
        c.append(a[0])
        a = a[1:]
    while(len(b) > 0):
        c.append(b[0])
        b = b[1:]
    return c

def mergesort(a):
    if(len(a) == 1):
        return a

    mid = int(len(a)/2)
    array_one = a[:mid]
    array_two = a[mid:]

    array_one = mergesort(array_one)
    array_two = mergesort(array_two)

    return merge(array_one, array_two)

print(mergesort(arr))
