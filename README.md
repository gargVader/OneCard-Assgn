## Description
Refactor the given code in such a way that code changes remain minimal incase more income levels are added. Focus on using SOLID principles, design patterns.

```java
    public static double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= 60000) {
            return (income - 30000) * 0.1 + 76500;
        } else {
            return (income - 60000) * 0.02 + 105600;
        }
    }

```
## Solution Explanation
Step 1️⃣: [`InsuranceCalculatorFactory.java`](src/InsuranceCalculatorFactory.java) gives us the correct instance of `InsuranceCalculator` for a given income.

Step 2️⃣: [`InsuranceCalculator.java`](src/InsuranceCalculator.java) is used to calculate insurance given an income.

## 💪 Advantages over previous code
- No need to new if-else blocks for new income levels.
- Minimal code change required. Just update [`calculateInsuranceMap `](https://github.com/gargVader/OneCard-Assgn/blob/main/src/InsuranceCalculatorFactory.java#L11)
