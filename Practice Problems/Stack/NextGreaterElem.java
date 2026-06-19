class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] a = new int[10001];
        Stack<Integer> st = new Stack<>();

        a[nums2[nums2.length - 1]] = -1;
        st.add(nums2[nums2.length - 1]);

        for (int i = nums2.length - 2; i >= 0; i--) {

            while (!st.isEmpty() && nums2[i] > st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                a[nums2[i]] = -1;
            } else {
                a[nums2[i]] = st.peek();
            }

            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = a[nums1[i]];
        }

        return ans;
    }
}