

public class BMI {

    float height;
    float weight;

    public BMI() {
        height = 0f;
        weight = 0f;
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
        if(bmi < 18.5f) {
            type = "gay";
        }
        else if(bmi >= 18.5f && bmi <= 24.9f) {
            type = "binh thuong";
        }
        else if(bmi >= 25f && bmi <= 29.9f) {
            type = "tang can";
        }
        else if(bmi >= 30f && bmi <= 34.9f) {
            type = "beo phi cap do 1";
        }
        else if(bmi >= 35f && bmi <= 39.9f) {
            type = "beo phi cap do 2";
        }
        else if(bmi >= 40f) {
            type = "beo phi cap do 3";
        }
        return type;
    }



    public String run() {
        if (weight < 20f || weight > 300f || height < 1.3f || height > 2.8f) {
            return ("khong hop le");
        } else {
            return ("BMI:" + BMI() + " " + "BMIType" + BMIType());
        }
    }
}
