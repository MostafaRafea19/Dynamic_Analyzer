#include <stdio.h>
FILE *fp;
int main ()
{fp =fopen("test.txt", "a");
fprintf(fp,"0\n");
fclose(fp);//block0
    int x =0;
    int y;
    if (x==0)
    {fp =fopen("test.txt", "a");
fprintf(fp,"1\n");
fclose(fp);//block1
        y=10;
    }
    else
    {fp =fopen("test.txt", "a");
fprintf(fp,"2\n");
fclose(fp);//block2
       if (1)
       {fp =fopen("test.txt", "a");
fprintf(fp,"3\n");
fclose(fp);//block3
           x++;
       }
       y=1;
    }
    if (1)
    {fp =fopen("test.txt", "a");
fprintf(fp,"4\n");
fclose(fp);//block4
        y++;
    }
    int a [] ={1,2,3};
    for (int x=0;x<3;x++)
    {fp =fopen("test.txt", "a");
fprintf(fp,"5\n");
fclose(fp);//block5
    }
    {fp =fopen("test.txt", "a");
fprintf(fp,"6\n");
fclose(fp);//block6
    int w;
    int z;
    }
}






