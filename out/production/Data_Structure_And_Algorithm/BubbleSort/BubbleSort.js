const BubbleSort=(arr)=>{
    for(let i=0; i<arr.length;i++){
        let switched = false;
        for(let x=1; x<arr.length-i;x++){
            if(arr[x-1]>arr[x]){
                switched=true;
                let temp= arr[x-1];
                arr[x-1]=arr[x];
                arr[x]=temp;
            }
        }
        console.log(arr)
        if(!switched){
            break;
        }
    }
    return arr;
}

const arr=[5,8,4,2,3,8,10,1,9];

console.log(BubbleSort(arr));