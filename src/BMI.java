

public class BMI {

    float height;
    float weight;

    public BMI() {
        height = 0;
        weight = 0;
    }

    public BMI(float weight, float height) {
        height = this.height;
        weight = this.weight;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float BMI() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public String BMIType() {
        String type = "";
        float bmi = BMI();
        if(bmi < 18.5) {
            type = "gay";
        }
        else if(bmi >= 18.5 && bmi <= 24.9) {
            type = "binh thuong";
        }
        else if(bmi >= 25 && bmi <= 29.9) {
            type = "tang can";
        }
        else if(bmi >= 30 && bmi <= 34.9) {
            type = "beo phi cap do 1";
        }
        else if(bmi >= 35 && bmi <= 39.9) {
            type = "beo phi cap do 2";
        }
        else if(bmi >= 40) {
            type = "beo phi cap do 3";
        }
        return type;
    }



    public String run() {
        if (weight < 20 || weight > 300 || height < 1.3 || height > 2.8) {
            return ("khong hop le");
        } else {
            return ("BMI:" + BMI() + " " + "BMIType" + BMIType());
        }
    }
}