package com.example.physicsdatareview;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataStorage {

    private static Context context;
    public static ArrayList<String> topicList = new ArrayList<>(Arrays.asList("Measurements & Uncertainties", "Mechanics", "Thermal Physics", "SHM and Waves", "Electricity and Magnetism", "Circular Motion and Gravitation", "Atomic, Nuclear and Particle Physics", "Energy Production","Wave Phenomena", "Fields", "Electromagnetic Induction", "Quantum and Nuclear Physics"));
    public static HashMap<Double, String> subtopicMap = new HashMap<>();
    public static  ArrayList<Formula> formulaList = new ArrayList<>();

    public static void populateFormulaList(){
        formulaList = new ArrayList<>(Arrays.asList(
            new Formula(1.2, R.drawable.e1_2, context.getResources().getString(R.string.e1_2))
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
