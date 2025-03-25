package FindInMountainArray;

public class MountainArray {
        private final int[]  mountainArray = {1,5,2};
        private final int length = mountainArray.length;
        public int get(int index){
            if (index>=length){
                return -1;
            }
            if (index<0){
                return -1;
            }
            return  mountainArray[index];
        }
        public int length(){
            return mountainArray.length;
        }
}
