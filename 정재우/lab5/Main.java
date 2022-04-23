
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main
{
	private static final int ROW = 5;
	private static final int COL = 5;
	
	public static void main(String[] args) {
		System.out.println("학번: 201811294, 이름: 정재우");
		int[] numbers = {1, 12, -1, 22, 17, 15, 123123, 22, -121, 199, 0, -11, -150};
		Arrays.sort(numbers); //
		for(int i=0; i<numbers.length; i++) {
		       System.out.print(numbers[i]);
		       System.out.print(" ");
		       }
				
		       System.out.println();
		
		int[][] map = new int[ROW][COL];
		setMap(map);
		
	
			Scanner sc = new Scanner(System.in);
		//isBingo 함수의 리턴이 true 일 때
    while(isBingo(map)) {
		System.out.print("숫자를 입력해주세요.[ex: 5]:");
		int bin = sc.nextInt();
		System.out.println();
		for(int i=0; i<ROW; i++) {
		    for(int j=0; j<COL; j++) {
		        if(bin==map[i][j]) {
		            map[i][j]=0;
		        }
		    }
		}
	} 
    System.out.println("축하합니다! 게임 승리!"); // 빙고 수 3이 되었을 때 배열 출력
	for(int i=0; i<ROW; i++){
        for(int j=0; j<COL; j++){
            System.out.print(map[i][j]);
            System.out.print(" ");
        }System.out.println(); 
        }
 }
  
  //setMap 함수 
  private static void setMap(int[][] map) {
            for(int i=1; i<=ROW*COL; i++) {
                boolean flag = true;
                while(flag) {
                    int mi = ((int)(Math.random()*10))%ROW;
                    int mj = ((int)(Math.random()*10))%COL;
                    if(map[mi][mj]==0) {
                        map[mi][mj]=i;
                        flag = false;
                    }
                }
                
            }
            }
        
      //빙고 수 체크 함수인 isBingo 줄의 합이 0이면 빙고인 논리 사용
        public static boolean isBingo(int[][] map) {
            int sum = 0;
            int bingo =0;
          
          //가로 빙고 체크
            for(int a=0; a<ROW; a++){ 
                {for(int i=0; i<COL; i++) {
                    
                    sum+=map[a][i]; }
                    if(sum==0) { bingo+=1;}
                }
                sum = 0;
            }
          
          //세로 빙고 체크
            for(int a=0; a<COL; a++){ 
                {for(int i=0; i<ROW; i++) {
                    
                    sum+=map[a][i]; }
                    if(sum==0) { bingo+=1;}
        } sum=0;
    }
        
          //대각선 빙고 체크
          int p=0; int q=0; int sum2 = 0;
            while(p<ROW && q<COL){ 
                { sum+= map[p][q]; //왼쪽에서 우하향
                
                sum2 += map[ROW-1-p][COL-1-q]; //오른쪽에서 좌하향 
                  p++; q++;
             } 
            }if(sum==0) {
                bingo+=1;
            }
            if(sum2==0){
                bingo+=1;
            }
            
        if(bingo>=3) {
            return false; 
        } else return true;    // 빙고가 3이면 게임을 끝내기 위해 false를 리턴
        }
}
        
