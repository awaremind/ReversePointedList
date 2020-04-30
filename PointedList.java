public class PointedList {
	
	static private Member first;
	
	static class Member {
		private String value;
		private Member next;
		
		Member(String value) {
			this.value = value;
			this.next = null;
		}
	}
	
	Member reversePointer (Member member) {
		Member prevNode, currentNode, nextNode;
		prevNode = null;
		currentNode = member;
		nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		member = prevNode;
		return member;
	}
	
	void printLinkedMemberList (Member member) {
		while (member != null) {
			System.out.println(member.value + " -> " + 
						((member.next != null) ? member.next.value : "null"));
			member = member.next;
		}
	}

	public static void main(String[] args) {
		
		PointedList list = new PointedList();
		list.first = new Member("aa");
		list.first.next = new Member("jj");
		list.first.next.next = new Member("oo");
		list.first.next.next.next = new Member("zz");
		
		System.out.println("List in order:");
		list.printLinkedMemberList(first);
		System.out.println();
		first = list.reversePointer(first);
		System.out.println("List in reverse order:");
		list.printLinkedMemberList(first);
		
		
	}

}
