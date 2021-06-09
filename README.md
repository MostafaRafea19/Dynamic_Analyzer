In main.java

// Step 1:

        // Uncomment this part to generate the c code
        /*
        injection d = new injection(tokens);
        T.walk(d,tree);
        FileWriter myWriter = new FileWriter("generated_c_code.c");
        myWriter.write(d.rewriter.getText());
        myWriter.close();
        */

// Step 2:

        // Run the generated C code file, it will generate "blocks.txt" file
        // Use this file with the the object below to generate the html file
        // Uncomment this part to generate the html file

// Step 3:

        /*
        Html html = new Html(tokens);
        T.walk(html,tree);
        FileWriter myWriter2 = new FileWriter("html_viewer.html");
        myWriter2.write(html.rewriter.getText());
        myWriter2.close();
        */
