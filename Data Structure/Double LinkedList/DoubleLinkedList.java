import java.util.*;
public class DoubleLinkedList
{
    public static void main(String args[]){
        
        Scanner Sc=new Scanner(System.in);
        DNode head=null;
        DNode tail=null;
        int ch=0;
        do{
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Front");
            System.out.println("3. Insert at Index");
            System.out.println("4. Insert After n");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Front");
            System.out.println("7. Delete at Index");
            System.out.println("8. Delete After n");
            System.out.println("9. Show Length");
            System.out.println("10. Show Linked List");
            System.out.println("11. Exit");
            System.out.println("Enter your Choice : ");
            ch=Sc.nextInt();
            int n=0;
            DNode cursor=null;
            switch(ch) {
                case 1:
                    System.out.println("Enter Number : ");
                    n=Sc.nextInt();
                    
                    DNode node1=new DNode();
                    node1.data=n;
                    node1.next=null;
                    node1.prev= tail;
                    tail.next=node1;
                    if(head==null){
                        head=node1;
                    }
                ;
                    
                    break;
                case 2:
                    System.out.println("Enter Number : ");
                    n=Sc.nextInt();
                    head=insertAtFront( head, n );
                    if(tail==null)
                    tail=node1;
                    break;
                case 3:
                    System.out.println("Enter number:");
                    n=Sc.nextInt();
                    System.out.println("Enter index:");
                    int index=Sc.nextInt();
                    LinkedList node_i =new LinkedList();
                    node_i.data=n;
                    if(index==0)
                        insertAtFront( head, n );
                    else if(head!=null)
                    {
                        int flag=1;
                        cursor=head;
                        while(cursor!=null)
                        {
                            if(flag==index)
                            break;
                            cursor=cursor.next;
                            flag++;
                        }
                        if(cursor!=null)
                        {
                            node_i.next=cursor.next;
                            cursor.next=node_i;
                        }
                        else
                        System.out.println("Number of nodes is less than index");
                    }
                    else
                        System.out.println("No node to insert after");
                    break;
                case 4:
                    System.out.println("Enter a number ");
                    n=Sc.nextInt();
                    System.out.println("Insert this after: ");
                    int search= Sc.nextInt();
                    cursor=head;
                    if( head ==  null)
                    System.out.println("No node");
                    else
                    {
                        while(cursor!=null)
                        {
                            if(cursor.data==search)
                            break;
                            cursor= cursor.next;
                        }
                        if(cursor== null)
                        System.out.println("The Element which you are looking for is not available in the link list");
                        else
                        {
                            LinkedList node_n= new LinkedList ();
                            node_n.data=n;
                            node_n.next=cursor.next;
                            cursor.next=node_n;
                        }
                    }
                    break;
                case 5:
                    
                    deleteAtEnd( head, cursor);
                    break;
                case 6:
                    deleteAtFront(head);
                    break;
                    
                case 7:
                    System.out.println("Enter Index position to delete : ");
                    int del_index=Sc.nextInt();
                    cursor=head;
                    if(head== null)
                    System.out.println("No Node to delete");
                    else if(del_index==0)
                    deleteAtFront( head);
                    else
                    {
                        int flag=1;
                        cursor=head;
                        while(cursor!=null)
                        {
                            if(flag==del_index)
                            break;
                            cursor=cursor.next;
                            flag++;
                        }
                        if(cursor!=null)
                        {
                            cursor.next=cursor.next.next;
                        }
                        else
                        System.out.println("Number of nodes is less than index");
                    }
                    break;
                case 8:
                    System.out.println("Delete this after: ");
                    int Del_search= Sc.nextInt();
                    cursor=head;
                    if( head ==  null)
                    System.out.println("No node");
                    else
                    {
                        while(cursor!=null)
                        {
                            if(cursor.data==Del_search)
                            break;
                            cursor= cursor.next;
                        }
                        if(cursor== null)
                            System.out.println("The Element which you are looking for is not available in the link list");
                        else
                            cursor.next=cursor.next.next;
                    }
                    break;
                case 9:
                    int len=0;
                    cursor=head;
                    while(cursor!=null)
                    {
                        len++;
                        cursor=cursor.next;
                    }
                    System.out.println("Length: "+len);
                    break;
                case 10:
                    
                    cursor=head;
                    while(cursor!=null){
                        System.out.print(cursor.data+" --> ");
                        cursor=cursor.next;
                    }
                    System.out.println("NULL");
                    
                    break;
                case 11:
                    System.exit(0);
            }
        }
        while(ch!=11);
        
    }
    public static DNode insertAtFront(DNode head,int n)
    {
        DNode node2=new DNode();
                    node2.data=n;
                    node2.next=head;
                    node2.prev=null;
                    if(head!=null)
                    head.prev=node2;
                    return node2;
    }
    public static void deleteAtFront(LinkedList head)
    {
        if(head!=null)
                        head=head.next;
        else
                        System.out.println("No node to delete");
    }
    public static void deleteAtEnd(LinkedList head, LinkedList cursor)
    {
        cursor=head;
                    if(head==null)
                        System.out.println("No node to delete");
                    else if(head.next==null)
                        head=null;
                    else
                    {
                        while((cursor.next).next!=null)
                            cursor=cursor.next;
                        cursor.next=null;
                    }
    }
}
//next is object
//data is variable
//head is object
//node1 is object
//cursor is object
//len is variable
//n is variable