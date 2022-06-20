package com.zjy.physicsdatareview;

import android.content.Context;

import com.example.physicsdatareview.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataStorage {

    private static Context context;
    public static ArrayList<String> topicList = new ArrayList<>(Arrays.asList("All Formulas","Measurements & Uncertainties", "Mechanics", "Thermal Physics", "SHM and Waves", "Electricity and Magnetism", "Circular Motion and Gravitation", "Atomic, Nuclear and Particle Physics", "Energy Production","Wave Phenomena", "Fields", "Electromagnetic Induction", "Quantum and Nuclear Physics"));
    public static HashMap<Double, String> subtopicMap = new HashMap<>();
    public static  ArrayList<Formula> formulaList = new ArrayList<>();

    //TODO: resize formula images 
    public static void populateFormulaList(){
        formulaList = new ArrayList<>(Arrays.asList(
                new Formula(1.2, R.drawable.e1_2, context.getResources().getString(R.string.e1_2)),
                new Formula(1.3, R.drawable.e1_3, context.getResources().getString(R.string.e1_3)),
                new Formula(2.1, R.drawable.e2_1, context.getResources().getString(R.string.e2_1)),
                new Formula(2.2, R.drawable.e2_2_1, context.getResources().getString(R.string.e2_2_1)),
                new Formula(2.2, R.drawable.e2_2_2, context.getResources().getString(R.string.e2_2_2)),
                new Formula(2.3, R.drawable.e2_3_1, context.getResources().getString(R.string.e2_3_1)),
                new Formula(2.3, R.drawable.e2_3_2, context.getResources().getString(R.string.e2_3_2)),
                new Formula(2.3, R.drawable.e2_3_3_1, context.getResources().getString(R.string.e2_3_3_1)),
                new Formula(2.3, R.drawable.e2_3_3_2, context.getResources().getString(R.string.e2_3_3_2)),
                new Formula(2.3, R.drawable.e2_3_4, context.getResources().getString(R.string.e2_3_4)),
                new Formula(2.3, R.drawable.e2_3_5, context.getResources().getString(R.string.e2_3_5)),
                new Formula(2.4, R.drawable.e2_4_1, context.getResources().getString(R.string.e2_4_1)),
                new Formula(2.4, R.drawable.e2_4_2, context.getResources().getString(R.string.e2_4_2)),
                new Formula(2.4, R.drawable.e2_4_3, context.getResources().getString(R.string.e2_4_3)),
                new Formula(2.4, R.drawable.e2_4_4, context.getResources().getString(R.string.e2_4_4)),
                new Formula(3.1, R.drawable.e3_1_1, context.getResources().getString(R.string.e3_1_1)),
                new Formula(3.1, R.drawable.e3_1_2, context.getResources().getString(R.string.e3_1_2)),
                new Formula(3.2, R.drawable.e3_2_1, context.getResources().getString(R.string.e3_2_1)),
                new Formula(3.2, R.drawable.e3_2_2, context.getResources().getString(R.string.e3_2_2)),
                new Formula(3.2, R.drawable.e3_2_3, context.getResources().getString(R.string.e3_2_3)),
                new Formula(3.2, R.drawable.e3_2_4, context.getResources().getString(R.string.e3_2_4)),
                new Formula(4.1, R.drawable.e4_1, context.getResources().getString(R.string.e4_1)),
                new Formula(4.2, R.drawable.e4_2, context.getResources().getString(R.string.e4_2)),
                new Formula(4.3, R.drawable.e4_3_1, context.getResources().getString(R.string.e4_3_1)),
                new Formula(4.3, R.drawable.e4_3_2, context.getResources().getString(R.string.e4_3_2)),
                new Formula(4.4, R.drawable.e4_4_1, context.getResources().getString(R.string.e4_4_1)),
                new Formula(4.4, R.drawable.e4_4_2, context.getResources().getString(R.string.e4_4_2)),
                new Formula(4.4, R.drawable.e4_4_3, context.getResources().getString(R.string.e4_4_3)),
                new Formula(5.1, R.drawable.e5_1_1, context.getResources().getString(R.string.e5_1_1)),
                new Formula(5.1, R.drawable.e5_1_2, context.getResources().getString(R.string.e5_1_2)),
                new Formula(5.1, R.drawable.e5_1_3, context.getResources().getString(R.string.e5_1_3)),
                new Formula(5.1, R.drawable.e5_1_4, context.getResources().getString(R.string.e5_1_4)),
                new Formula(5.1, R.drawable.e5_1_5, context.getResources().getString(R.string.e5_1_5)),
                new Formula(5.1, R.drawable.e5_1_6, context.getResources().getString(R.string.e5_1_6)),
                new Formula(5.2, R.drawable.e5_2_1, context.getResources().getString(R.string.e5_2_1)),
                new Formula(5.2, R.drawable.e5_2_2, context.getResources().getString(R.string.e5_2_2)),
                new Formula(5.2, R.drawable.e5_2_3, context.getResources().getString(R.string.e5_2_3)),
                new Formula(5.2, R.drawable.e5_2_4, context.getResources().getString(R.string.e5_2_4)),
                new Formula(5.2, R.drawable.e5_2_5, context.getResources().getString(R.string.e5_2_5)),
                new Formula(5.3, R.drawable.e5_3, context.getResources().getString(R.string.e5_3)),
                new Formula(5.4, R.drawable.e5_4_1, context.getResources().getString(R.string.e5_4_1)),
                new Formula(5.4, R.drawable.e5_4_2, context.getResources().getString(R.string.e5_4_2)),
                new Formula(6.1, R.drawable.e6_1_1, context.getResources().getString(R.string.e6_1_1)),
                new Formula(6.1, R.drawable.e6_1_2, context.getResources().getString(R.string.e6_1_2)),
                new Formula(6.1, R.drawable.e6_1_3, context.getResources().getString(R.string.e6_1_3)),
                new Formula(6.2, R.drawable.e6_2_1, context.getResources().getString(R.string.e6_2_1)),
                new Formula(6.2, R.drawable.e6_2_2, context.getResources().getString(R.string.e6_2_2)),
                new Formula(7.1, R.drawable.e7_1, context.getResources().getString(R.string.e7_1)),
                new Formula(7.2, R.drawable.e7_2, context.getResources().getString(R.string.e7_2)),
                new Formula(7.3, R.drawable.e7_3_1, context.getResources().getString(R.string.e7_3_1)),
                new Formula(7.3, R.drawable.e7_3_2, context.getResources().getString(R.string.e7_3_2)),
                new Formula(7.3, R.drawable.e7_3_3, context.getResources().getString(R.string.e7_3_3)),
                new Formula(8.1, R.drawable.e8_1_1, context.getResources().getString(R.string.e8_1_1)),
                new Formula(8.1, R.drawable.e8_1_2, context.getResources().getString(R.string.e8_1_2)),
                new Formula(8.2, R.drawable.e8_2_1, context.getResources().getString(R.string.e8_2_1)),
                new Formula(8.2, R.drawable.e8_2_2, context.getResources().getString(R.string.e8_2_2)),
                new Formula(8.2, R.drawable.e8_2_3, context.getResources().getString(R.string.e8_2_3)),
                new Formula(8.2, R.drawable.e8_2_4, context.getResources().getString(R.string.e8_2_4)),
                new Formula(9.1, R.drawable.e9_1_1, context.getResources().getString(R.string.e9_1_1)),
                new Formula(9.1, R.drawable.e9_1_2, context.getResources().getString(R.string.e9_1_2)),
                new Formula(9.1, R.drawable.e9_1_3, context.getResources().getString(R.string.e9_1_3)),
                new Formula(9.1, R.drawable.e9_1_4_1, context.getResources().getString(R.string.e9_1_4_1)),
                new Formula(9.1, R.drawable.e9_1_4_2, context.getResources().getString(R.string.e9_1_4_2)),
                new Formula(9.1, R.drawable.e9_1_5, context.getResources().getString(R.string.e9_1_5)),
                new Formula(9.2, R.drawable.e9_2, context.getResources().getString(R.string.e9_2)),
                new Formula(9.3, R.drawable.e9_3_1, context.getResources().getString(R.string.e9_3_1)),
                new Formula(9.3, R.drawable.e9_3_2, context.getResources().getString(R.string.e9_3_2)),
                new Formula(9.4, R.drawable.e9_4_1, context.getResources().getString(R.string.e9_4_1)),
                new Formula(9.4, R.drawable.e9_4_2, context.getResources().getString(R.string.e9_4_2)),
                new Formula(9.5, R.drawable.e9_5_1, context.getResources().getString(R.string.e9_5_1)),
                new Formula(9.5, R.drawable.e9_5_2, context.getResources().getString(R.string.e9_5_2)),
                new Formula(10.1, R.drawable.e10_1, context.getResources().getString(R.string.e10_1)),
                new Formula(10.2, R.drawable.e10_2_1, context.getResources().getString(R.string.e10_2_1)),
                new Formula(10.2, R.drawable.e10_2_2, context.getResources().getString(R.string.e10_2_2)),
                new Formula(10.2, R.drawable.e10_2_3, context.getResources().getString(R.string.e10_2_3)),
                new Formula(10.2, R.drawable.e10_2_4, context.getResources().getString(R.string.e10_2_4)),
                new Formula(10.2, R.drawable.e10_2_5, context.getResources().getString(R.string.e10_2_5)),
                new Formula(11.1, R.drawable.e11_1_1, context.getResources().getString(R.string.e11_1_1)),
                new Formula(11.1, R.drawable.e11_1_2, context.getResources().getString(R.string.e11_1_2)),
                new Formula(11.1, R.drawable.e11_1_3, context.getResources().getString(R.string.e11_1_3)),
                new Formula(11.2, R.drawable.e11_2_1, context.getResources().getString(R.string.e11_2_1)),
                new Formula(11.2, R.drawable.e11_2_2, context.getResources().getString(R.string.e11_2_2)),
                new Formula(11.2, R.drawable.e11_2_3, context.getResources().getString(R.string.e11_2_3)),
                new Formula(11.3, R.drawable.e11_3_1, context.getResources().getString(R.string.e11_3_1)),
                new Formula(11.3, R.drawable.e11_3_2, context.getResources().getString(R.string.e11_3_2)),
                new Formula(11.3, R.drawable.e11_3_3, context.getResources().getString(R.string.e11_3_3)),
                new Formula(11.3, R.drawable.e11_3_4, context.getResources().getString(R.string.e11_3_4)),
                new Formula(11.3, R.drawable.e11_3_5, context.getResources().getString(R.string.e11_3_5)),
                new Formula(11.3, R.drawable.e11_3_6, context.getResources().getString(R.string.e11_3_6)),
                new Formula(12.1, R.drawable.e12_1_1, context.getResources().getString(R.string.e12_1_1)),
                new Formula(12.1, R.drawable.e12_1_2, context.getResources().getString(R.string.e12_1_2)),
                new Formula(12.1, R.drawable.e12_1_3, context.getResources().getString(R.string.e12_1_3)),
                new Formula(12.1, R.drawable.e12_1_4, context.getResources().getString(R.string.e12_1_4)),
                new Formula(12.1, R.drawable.e12_1_5, context.getResources().getString(R.string.e12_1_5)),
                new Formula(12.1, R.drawable.e12_1_6, context.getResources().getString(R.string.e12_1_6)),
                new Formula(12.2, R.drawable.e12_2_1_1, context.getResources().getString(R.string.e12_2_1_1)),
                new Formula(12.2, R.drawable.e12_2_1_2, context.getResources().getString(R.string.e12_2_1_2)),
                new Formula(12.2, R.drawable.e12_2_2, context.getResources().getString(R.string.e12_2_2))

           //TODO: populate arraylist
    ));
    }

    public static void populateSubTopicMap(){
        subtopicMap.put(1.2, "Uncertainties and errors");
        subtopicMap.put(1.3, "Vectors and scalars");
        subtopicMap.put(2.1, "Motion");
        subtopicMap.put(2.2, "Forces");
        subtopicMap.put(2.3, "Work, energy and power");
        subtopicMap.put(2.4, "Momentum and impulse");
        subtopicMap.put(3.1, "Thermal concepts");
        subtopicMap.put(3.2, "Modelling a gas");
        subtopicMap.put(4.1, "Oscillations");
        subtopicMap.put(4.2, "Travelling Waves");
        subtopicMap.put(4.3, "Wave characteristics");
        subtopicMap.put(4.4, "Wave behaviour");
        subtopicMap.put(5.1, "Electric fields");
        subtopicMap.put(5.2, "Heating effect of electric currents");
        subtopicMap.put(5.3, "Electric cells");
        subtopicMap.put(5.4, "Magnetic effects of electric currents");
        subtopicMap.put(6.1, "Circular motion");
        subtopicMap.put(6.2, "Newton's law of gravitation");
        subtopicMap.put(7.1, "Discrete energy and radioactivity");
        subtopicMap.put(7.2, "Nuclear reactions");
        subtopicMap.put(7.3, "The structure of matter");
        subtopicMap.put(8.1, "Energy sources");
        subtopicMap.put(8.2, "Thermal energy transfer");
        subtopicMap.put(9.1, "Simple harmonic motion");
        subtopicMap.put(9.2, "Single-slit diffraction");
        subtopicMap.put(9.3, "Interference");
        subtopicMap.put(9.4, "Resolution");
        subtopicMap.put(9.5, "Doppler effect");
        subtopicMap.put(10.1, "Describing fields");
        subtopicMap.put(10.2, "Fields at work");
        subtopicMap.put(11.1, "Electromagnetic induction");
        subtopicMap.put(11.2, "Power generation and transmission");
        subtopicMap.put(11.3, "Capacitance");
        subtopicMap.put(12.1, "The interaction of matter with radiation");
        subtopicMap.put(12.2, "Nuclear physics");
    }

    public static Context getContext(){
        return context;
    }

    public static void setContext(Context context){
        DataStorage.context = context;
    }

}
