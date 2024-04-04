/*
 
Locker Problem
There is a school with 100 students, and correspondingly 100 lockers, all of which start off closed. 
The first student opens every locker. The second student closes every other locker, 
starting with the second (2, 4, 6 etc). 
The third student changes the state of every third locker starting with the third (3,6,9 etc). 
The fourth would change the status of lockers numbered 4,8,12 etc.,. 
That is, if the locker is open, it is closed, and if it is closed, it is opened. 
This continues until all 100 students have passed along the lockers. 
After the 100th student is done, which lockers are open and which are closed?
[Note: program should work for any number of students/lockers]

Sample Input 1
100
Sample Output 1
open = 10
close = 90

Sample Input 2
646474
Sample Output 2
open = 804
close = 645670

Sample Input 3
10
Sample Output 3
open = 3
close= 7


 */

package zoho;

public class lockerProblem {
    public static void main(String[] args) {
        int n = 646474;
        int sq = 2;
        int i = 2;
        int count = 0;
        while(sq<=n){
            sq = i *i;
            i++;
            count++;
        }
        System.out.println("open = "+count);
        System.out.println("closed = "+(n-count));
    }
}
