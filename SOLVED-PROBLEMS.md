# Solved Problem Index

The following are implemented Java examples in this repository. Each source file is standalone and contains no explanatory comments.

| Topic | Question | Solution | Time | Auxiliary space |
|---|---|---|---:|---:|
| Java basics | Check even or odd | [EvenOrOdd.java](01-Java-Basics/EvenOrOdd.java) | O(1) | O(1) |
| Java basics | Largest of three numbers | [LargestOfThree.java](01-Java-Basics/LargestOfThree.java) | O(1) | O(1) |
| Java basics | Factorial using a loop | [Factorial.java](01-Java-Basics/Factorial.java) | O(n) | O(1) |
| Java basics | Check prime number | [PrimeCheck.java](01-Java-Basics/PrimeCheck.java) | O(√n) | O(1) |
| Java basics | Sum using a method | [SumOfTwo.java](01-Java-Basics/SumOfTwo.java) | O(1) | O(1) |
| Arrays | Find minimum and maximum | [ArrayMinMax.java](03-Arrays/ArrayMinMax.java) | O(n) | O(1) |
| Arrays | Reverse an array in place | [ReverseArray.java](03-Arrays/ReverseArray.java) | O(n) | O(1) |
| Arrays | Binary search in sorted array | [BinarySearch.java](03-Arrays/BinarySearch.java) | O(log n) | O(1) |
| Arrays | Maximum subarray sum (Kadane) | [KadaneAlgorithm.java](03-Arrays/KadaneAlgorithm.java) | O(n) | O(1) |
| Sorting | Merge sort | [MergeSort.java](04-Searching-and-Sorting/MergeSort.java) | O(n log n) | O(n) |
| Recursion | Factorial | [FactorialRecursion.java](09-Recursion/FactorialRecursion.java) | O(n) | O(n) |
| Recursion | Fast power | [FastPower.java](09-Recursion/FastPower.java) | O(log n) | O(log n) |
| Recursion | First occurrence in array | [FirstOccurrence.java](09-Recursion/FirstOccurrence.java) | O(n) | O(n) |
| Recursion | Binary strings without adjacent 1s | [BinaryStrings.java](09-Recursion/BinaryStrings.java) | O(2ⁿ) upper bound | O(n) stack, excluding output |
| Linked list | Reverse a singly linked list | [ReverseLinkedList.java](11-Linked-Lists/ReverseLinkedList.java) | O(n) | O(1) |
| Linked list | Find middle node | [MiddleOfLinkedList.java](11-Linked-Lists/MiddleOfLinkedList.java) | O(n) | O(1) |
| Stack | Valid parentheses | [ValidParentheses.java](12-Stacks/ValidParentheses.java) | O(n) | O(n) |
| Stack | Next greater element | [NextGreaterElement.java](12-Stacks/NextGreaterElement.java) | O(n) | O(n) |
| Binary tree | Maximum depth | [MaximumDepth.java](14-Binary-Trees/MaximumDepth.java) | O(n) | O(h) recursion |
| BST | Search a key | [SearchInBST.java](15-Binary-Search-Trees/SearchInBST.java) | O(h) | O(h) recursion |
| Graph | Breadth-first traversal | [BFS.java](17-Graphs/BFS.java) | O(V + E) | O(V) |
| Dynamic programming | Climbing stairs, space optimised | [ClimbingStairs.java](20-Dynamic-Programming/ClimbingStairs.java) | O(n) | O(1) |
| Segment tree | Range sum query | [RangeSumSegmentTree.java](22-Segment-Trees/RangeSumSegmentTree.java) | Build O(n), query O(log n) | O(n) |

## A few worked approaches

### Reverse an array
**Question:** Given an array, reverse its elements without creating another array.

**Approach:** Keep one pointer at the beginning and one at the end. Swap the values and move both pointers inward until they meet.

**Pseudocode**
```text
left = 0
right = length - 1
while left < right
    swap array[left], array[right]
    left = left + 1
    right = right - 1
```

### Binary search
**Question:** Find the index of a target in a sorted array, or return -1.

**Approach:** Check the middle element. Discard the half that cannot contain the target.

**Pseudocode**
```text
left = 0
right = n - 1
while left <= right
    mid = left + (right - left) / 2
    if array[mid] == target: return mid
    if array[mid] < target: left = mid + 1
    else: right = mid - 1
return -1
```

### Maximum subarray sum
**Question:** Find the largest sum among all contiguous subarrays.

**Approach:** At each index, either start a new subarray or extend the current one. Keep the best sum seen so far. Initialising from the first element also handles all-negative arrays.

### Fast power
**Question:** Compute xⁿ using fewer multiplications.

**Approach:** Compute the half power once. Square it; multiply by x when the exponent is odd. The exponent is halved on every call.

### Reverse a linked list
**Question:** Reverse the next pointers of a singly linked list.

**Approach:** Maintain previous, current and nextNode references. Save the next node before changing the current link.

### Valid parentheses
**Question:** Decide whether every closing bracket matches the most recent unmatched opening bracket.

**Approach:** Push opening brackets. For each closing bracket, require a matching stack top. The stack must be empty at the end.

### Breadth-first search
**Question:** Visit vertices in increasing distance from a start vertex in an unweighted graph.

**Approach:** Use a queue. Mark a vertex visited when it is enqueued so that it is not added repeatedly.

### Climbing stairs
**Question:** If one can climb one or two steps, count the ways to reach step n.

**Approach:** The last move comes from n-1 or n-2, so ways(n) = ways(n-1) + ways(n-2). Only the previous two values are needed.

## Adding the next solutions
The topic READMEs contain the next practice targets. As a question is implemented, add its Java file and update this index with its complexity. Do not mark an exercise solved just because it appears in a topic list.

## Company tags from the Apna College sheet
- **Maximum and Minimum Element in an Array:** ABCO, Accolite, Amazon, Cisco, Hike, Microsoft, Snapdeal, VMWare, Google and Adobe.
- **Reverse the Array:** Infosys and Moonfrog Labs.
- **Maximum-Subarray:** Microsoft and Facebook.
- **Contains Duplicate:** Amazon.

These labels are copied from the uploaded Apna College question sheet. They describe the sheet's company column and are not independently verified interview reports. For other examples in this repository, no company label is shown unless the source sheet explicitly supports it.
