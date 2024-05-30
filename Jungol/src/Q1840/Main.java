package Q1840;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //세로
		int b = sc.nextInt(); // 가로
		int x = 0;  //세로배열
		int y = 0;  //가로배열
		int k = 0; //
		int l = 0;
		int time = 0;
		int cnt = 0;
		int e = 0;
		int last = 0;
		int[][] c = new int[a][b];
		for(int i=0; i<a*b; i++,y++) {
			if(b-y==0) {
				x++;
				y=0;
			}
			c[x][y]=sc.nextInt();	
			if(c[x][y]==1) {
				cnt++; //1개수 구하기
			}
		}
		while(true) {
		out:
		for(int i=0; i<a;i++){ // 좌-> 우
			in:
			for(int j=0;j<b;j++) {
			if(c[i][j]==1 || c[i][j]==2 ) {
				c[i][j]=2;
				continue out;
			}else {
				
				if(i==0 || i==a-1) {
					continue in;	
					}
				
				
				if(c[i+1][j]==1 ) {
					c[i+1][j]=2;
				}
				if(c[i+1][j]==0) {
					k=i+1;
					A:
			for(l=j;k<a;k++) {
				if(c[k][l]==1) {
					c[k][l]=2;
					break A;
				}else {
				}
				
				}
				}
				
				
				if(c[i-1][j]==1) {
					c[i-1][j]=2;
				}
				if(c[i+1][j]==0) {
					k=i-1;
					A:
			for(l=j;k>=0;k--) {
				if(c[k][l]==1) {
					c[k][l]=2;
					break A;
				}else {
				}
				
				}
				}
				
					
				
			}
			}
		}	
		out:
			for(int i=a-1; i>=0;i--){ // 우->좌
				in:
				for(int j=b-1;j>=0;j--) {
				if(c[i][j]==1 || c[i][j]==2 ) {
					c[i][j]=2;
					continue out;
					}else {
						if(i==0 || i==a-1) {
							continue in;	
							}
						
						
						if(c[i+1][j]==1) {
							c[i+1][j]=2;
						}
						if(c[i+1][j]==0) {
							k=i+1;
							A:
					for(l=j;k<a;k++) {
						if(c[k][l]==1) {
							c[k][l]=2;
							break A;
						}else {
						}
						
						}
						}
						
						
						if(c[i-1][j]==1 ) {
							c[i-1][j]=2;	
						}
						if(c[i+1][j]==0) {
							k=i-1;
							A:
					for(l=j;k>=0;k--) {
						if(c[k][l]==1) {
							c[k][l]=2;
							break A;
						}else {
						}
						
						}
						}
					}
		}
	}
		out:
		  for(int j=0;j<b;j++) {
			  in:
			  for(int i=0; i<a;i++){ // 상->하
				if(c[i][j]==1 || c[i][j]==2) {
					c[i][j]=2;
					continue out;
				}else {
					
					
					if(j==0 || j==b-1) {
					continue in;	
					}
					
					if(c[i][j+1]==1 ) {
						c[i][j+1]=2;	
					}
						
					if(c[i][j+1]==0) {
							l=j+1;
							A:
					for(k=i;l<b;l++) {
						if(c[k][l]==1) {
							c[k][l]=2;
							break A;
						}else {
						}
						
						}
						}
					
					
					if(c[i][j-1]==1 ) {
						c[i][j-1]=2;	
					}
					if(c[i][j-1]==0 ) {
						l=j-1;
						A:
				for(k=i;l>=0;l--) {
					if(c[k][l]==1) {
						c[k][l]=2;
						break A;
					}else {
					}
					
					}
					}
				}
				}
			}
	
	out:
		  for(int j=b-1;j>=0;j--) {
			  in:
			  for(int i=a-1; i>=0;i--){ // 하->상
				if(c[i][j]==1 || c[i][j]==2) {
					c[i][j]=2;
					continue out;
				}else {
					
					
					if(j==0 || j==b-1) {
					continue in;	
					}
					
					if(c[i][j+1]==1 ) {
						c[i][j+1]=2;
					}
					
					if(c[i][j+1]==0) {
						l=j+1;
						A:
				for(k=i;l<b;l++) {
					if(c[k][l]==1) {
						c[k][l]=2;
						break A;
					}else {
					}
					
					}
					}
					
					
					if(c[i][j-1]==1 ) {
						c[i][j-1]=2;	
					}
					if(c[i][j-1]==0 ) {
						l=j-1;
						A:
					for(k=i;l>=0;l--) {
						if(c[k][l]==1) {
							c[k][l]=2;
							break A;
						}else {
						}
						}
					}
				}
				}
			}
			
			x=0;
			y=0;
			e=0;
			for(int i=0; i<a*b; i++,y++) {
				if(b-y==0) {
					x++;
					y=0;
				}
				if(c[x][y]==2) {
					e++;    //2개수 구하기
					c[x][y]=0;
				}
			}
			
			time++; 
			last = cnt-e;
			
			if(time==1) {
				sc.close();
				System.out.println(time);
				System.out.print(e);
				break;
			}
			
			
			
			//31
		}	
	}		
	}
