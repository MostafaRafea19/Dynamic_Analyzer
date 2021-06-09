#include "stdio.h"

FILE *fp;
int main ()
{fp =fopen("blocks.txt", "a");
fprintf(fp,"0\n");
fclose(fp);
    int x = 0;
    int y;

    if (x == 0)
    {fp =fopen("blocks.txt", "a");
fprintf(fp,"1\n");
fclose(fp);
        y=10;
    }
    else
    {fp =fopen("blocks.txt", "a");
fprintf(fp,"2\n");
fclose(fp);
       if (1)
       {fp =fopen("blocks.txt", "a");
fprintf(fp,"3\n");
fclose(fp);
           x++;
       }
       y = 1;
    }
    if (1)
    {fp =fopen("blocks.txt", "a");
fprintf(fp,"4\n");
fclose(fp);
        y++;
    }

    int a [] ={1,2,3};

    for (int x = 0; x < 5;x++)
    {fp =fopen("blocks.txt", "a");
fprintf(fp,"5\n");
fclose(fp);
        y++;
    }

    if (0)
    {fp =fopen("blocks.txt", "a");
fprintf(fp,"6\n");
fclose(fp);
        x = 10;
    }

    if (1)
    {fp =fopen("blocks.txt", "a");
fprintf(fp,"7\n");
fclose(fp);
        x = 10;
    }
}