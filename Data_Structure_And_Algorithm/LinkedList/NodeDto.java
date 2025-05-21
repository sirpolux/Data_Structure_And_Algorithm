package LinkedList;

public class NodeDto {
    int size;
    NodeData nodeDto;

    public class NodeData{
        int value;
        NodeData next;


        public NodeData(){

        }
        public NodeData(int value){
            this.value = value;
        }

        public NodeData (int value, NodeData nodeData){
            this.value=value;
            this.next = nodeData;
        }
    }

}
