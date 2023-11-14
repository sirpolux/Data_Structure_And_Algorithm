/**
 * @param {number[][]} accounts
 * @return {number}
 */

const accounts = [[1,5],[7,3],[3,5]];
let richestClient = maximumWealth(accounts);
console.log(richestClient);

//Sample data
var maximumWealth = function(accounts) {
    let maxBalance = Number.MIN_SAFE_INTEGER;
    accounts.forEach(person=>{
        let currentBalance=0;
        person.forEach(accountBalance=>{
            currentBalance+=accountBalance;
        })
        if(currentBalance>maxBalance)
            maxBalance=currentBalance;
    })
    return maxBalance;
};

