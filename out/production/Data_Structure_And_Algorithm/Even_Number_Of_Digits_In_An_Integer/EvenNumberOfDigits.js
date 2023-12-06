var findNumbers=function(nums){
    let evenCount=0;
    nums.forEach(element=>{
        if(isEvenLen(getLen(element)))
            evenCount++
    })
    return evenCount;
}

const getLen=(num)=>{
    if(num==0)
        return 1
    if (num<0){
        return (Math.floor(Math.log10(num * -1)+1))
    }
    return (Math.floor(Math.log10(num)+1));
}

const isEvenLen=(len)=>{
    return len%2==0
}

