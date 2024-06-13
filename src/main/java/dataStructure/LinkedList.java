package dataStructure;

public class LinkedList {
    private Node head;

    private Node tail;

    private int length;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
        }
    }

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }


    public void getHead(){
        if (this.head == null){
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    public void getTail(){
        if(this.tail == null){
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getLength(){
        System.out.println("Length: " + this.length);
    }

    // removendo no inicio da lista
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    // apagando a lista completa
    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // printando a lista completa
    public void print(){
        System.out.println("##############################");
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // adicionando no inicio da lista
    public void prepend(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // adicionando no fim da lista
    public void append(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // adicionando em uma posição especifica da lista
    public boolean insert(int index, String data){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(data);
            return true;
        } if (index == length){
            append(data);
            return true;
        }
        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    // alterando um elemento da lista com metodo set
    public boolean set(int index, String data){
        if(index < 0 || index >= length) return false;
        Node temp = get(index);
        temp.data = data;
        return true;
    }


    // consultando um elemento da lista
    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    // removendo no fim da lista
    public Node removeLast(){
        if(length == 0) return null;
        Node pre = head;
        Node temp = null;
        while(pre.next != tail){
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    // removendo um elemento da lista
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();
        Node temp = get(index - 1);
        Node removed = temp.next;
        temp.next = removed.next;
        length--;
        return removed;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.prepend("elemento 0");

        System.out.println("Informaçõe da lista: ");
        list.getHead();
        list.getTail();
        list.getLength();
        System.out.println("-------------------------------");

        System.out.println("imprimindo um elemento da lista com list.get");
        System.out.println(list.get(3).data);
        System.out.println("-------------------------------");

        System.out.println("Inserindo um elemento no meio da lista com list.insert");
        list.insert(1, "elemento 2.5");
        System.out.println("-------------------------------");

        System.out.println("Imprimindo a lista completa:");
        list.print();
        System.out.println("-------------------------------");

        System.out.println("Alterando um elemento da lista com list.set");
        list.set(2, "elemento 2.6");
        list.print();
        System.out.println("-------------------------------");

        System.out.println("Removendo o último elemento da lista:");
        list.removeLast();

        System.out.println("Removendo o primeiro elemento da lista:");
        list.removeFirst();

        System.out.println("Removendo o terceiro elemento da lista:");
        list.remove(2);

        System.out.println("Imprimindo novamente a lista completa:");
        list.print();
        System.out.println("-------------------------------");

        System.out.println("Limpando a lista completa:");
        list.makeEmpty();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(">>>>> Informaçoes da lista, após limpa <<<<<<< ");
        list.getHead();
        list.getTail();
        list.getLength();
    }

}
