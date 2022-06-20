package com.zjy.physicsdatareview;

import java.io.Serializable;

public class Formula implements Serializable {
    int formulaImage;
    String explanation;
    double subtopic;

    Formula(double subtopic, int formulaImage, String explanation){
        this.formulaImage = formulaImage;
        this.explanation = explanation;
        this.subtopic = subtopic;
    }
}
