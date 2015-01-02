
//Definition for singly-linked list with a random pointer.
/* class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
}; */

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode,RandomListNode> forCopy = new HashMap<>();
        RandomListNode output = new RandomListNode(1);
        RandomListNode indicate = output;
        while(head != null) {
			RandomListNode tmp = new RandomListNode(head.label);
			tmp.random = head.random;
			tmp.next = null;
			forCopy.put(head,tmp);
			indicate.next = tmp;
			indicate = tmp;
			head = head.next;
        }
		indicate = output.next;
		while(indicate != null){
			if(indicate.random != null)
				indicate.random = forCopy.get(indicate.random);
			indicate = indicate.next;
		}
		return output.next;
    }
}