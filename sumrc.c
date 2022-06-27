#include <stdio.h>

int main()
{
    int r,c,i,j,a[3][3];
    printf("Enter the number of rows and column\n");
    scanf("%d %d",&r,&c); 
    int arr[r][c];  
    printf("Enter the elements of the matrix\n");
    for(i=0;i<r;i++)    
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nElements in the matrix are \n");
    for(i=0;i<r;i++)   
   {
        for(j=0;j<c;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    printf("\nRow Sum : \n");
    for(i=0;i<r;i++)   
    {
        int rsum=0;
        for( j=0;j<c;j++)
        {
            rsum=rsum+a[i][j];
        }
        printf("\nSum of all the elements in row %d is %d\n",i,rsum);
    }
    printf("\nColumn Sum \n");
    for(i=0;i<r;i++)
    {
        int csum=0;
        for(j=0;j<=c;j++)
        {
            csum=csum+a[j][i];
        }
        printf("\nSum of all the elements in column %d is %d\n",i,csum);
    }
    return 0;
}