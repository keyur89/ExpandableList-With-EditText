package com.journaldev.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpandableListDataPump {

    public static HashMap<String, ArrayList<HashMap<String, String>>> getData() {
        HashMap<String, ArrayList<HashMap<String, String>>> expandableListDetail = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();

        ArrayList<HashMap<String, String>> bmiProfile = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("param", "Height");
        hashMap.put("value", "0");
        bmiProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Weight");
        hashMap.put("value", "0");
        bmiProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "BMI");
        hashMap.put("value", "0");
        bmiProfile.add(hashMap);

        ArrayList<HashMap<String, String>> whrProfile = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("param", "Waist");
        hashMap.put("value", "0");
        whrProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Hip");
        hashMap.put("value", "0");
        whrProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "WHR");
        hashMap.put("value", "0");
        whrProfile.add(hashMap);

        ArrayList<HashMap<String, String>> bloodPressureProfile = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("param", "Systolic");
        hashMap.put("value", "0");
        bloodPressureProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Diastolic");
        hashMap.put("value", "0");
        bloodPressureProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Pulse");
        hashMap.put("value", "0");
        bloodPressureProfile.add(hashMap);

        ArrayList<HashMap<String, String>> lipidProfile = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("param", "HDL");
        hashMap.put("value", "0");
        lipidProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "LDL");
        hashMap.put("value", "0");
        lipidProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Total Cholesterol");
        hashMap.put("value", "0");
        lipidProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Triglyceride");
        hashMap.put("value", "0");
        lipidProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "VLDL");
        hashMap.put("value", "0");
        lipidProfile.add(hashMap);

        ArrayList<HashMap<String, String>> diabeticProfile = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("param", "Blood Sugar (Fasting)");
        hashMap.put("value", "0");
        diabeticProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Blood Sugar (Post meal)");
        hashMap.put("value", "0");
        diabeticProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Blood Sugar (Random)");
        hashMap.put("value", "0");
        diabeticProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Blood Sugar (Oral)");
        hashMap.put("value", "0");
        diabeticProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "Blood Sugar (HBA1C)");
        hashMap.put("value", "0");
        diabeticProfile.add(hashMap);

        ArrayList<HashMap<String, String>> thyroidProfile = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("param", "T3");
        hashMap.put("value", "0");
        thyroidProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "T4");
        hashMap.put("value", "0");
        thyroidProfile.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("param", "TSH");
        hashMap.put("value", "0");
        thyroidProfile.add(hashMap);

        expandableListDetail.put("BMI PROFILE", bmiProfile);
        expandableListDetail.put("WHR PROFILE", whrProfile);
        expandableListDetail.put("BLOOD PRESSURE PROFILE", bloodPressureProfile);
        expandableListDetail.put("LIPID PROFILE", lipidProfile);
        expandableListDetail.put("DIABETIC PROFILE", diabeticProfile);
        expandableListDetail.put("THYROID PROFILE", thyroidProfile);
        return expandableListDetail;
    }
}
