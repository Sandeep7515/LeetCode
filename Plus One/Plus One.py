class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        my_string=''.join(str(d) for d in digits)
        number=int(my_string)
        number=number+1
        li=list(str(number))
        num_list=[int(m) for m in li]
        return num_list
