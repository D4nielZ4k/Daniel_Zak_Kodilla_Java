package com.kodilla.stream;
//import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;
import java.util.concurrent.Executor;



public class StreamMain {

    public static void main(String[] args) {
       // Processor processor = new Processor();
       // processor.execute(() -> System.out.println("This is an example text."));
//
       // ExpressionExecutor expressionExecutor = new ExpressionExecutor();
       // System.out.println("Calculating expressions with lambdas");
       // expressionExecutor.executeExpression(10,5 ,(a,b)-> a + b);
       // expressionExecutor.executeExpression(10,5, (a,b)-> a - b);
       // expressionExecutor.executeExpression(10,5, (a,b)-> a *b);
       // expressionExecutor.executeExpression(10,5, (a,b)-> a / b);
       // System.out.println();
       // System.out.println();
       // System.out.println();
//
       // System.out.println("Calculating expressions with method references");
       // expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
       // expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB );
       // expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
       // expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
//
        System.out.println("PoemBeautifier ");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text", n -> "''"+ n+"''" );
        poemBeautifier.beautify("qwertyuiop", n -> n+ " text length :"+ n.length());
        poemBeautifier.beautify("text", n->  n.toUpperCase(Locale.ROOT) );
        poemBeautifier.beautify("TEXT", n-> n.toLowerCase(Locale.ROOT));


    }
}
