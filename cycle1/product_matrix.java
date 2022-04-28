class Product
{
    public static void main(String args[])
    {
        int i,j,k,sum=0;
        int mat1[][]={{1,2,3},{1,2,3},{1,2,3}};
        int mat2[][]={{1,1,1},{1,1,1},{1,1,1}};
        int mat3[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    sum+=mat1[i][k]*mat2[k][j];
                }
                mat3[i][j]=sum;
                sum=0;
            }
        }
        System.out.println("The product of two matrices is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            { 
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }

    }    
}