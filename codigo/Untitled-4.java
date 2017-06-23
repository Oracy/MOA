Agrawal Generator dataset

balanceClassesOption para balancear as classes entre elas para não haver uma discrepancia grande.

determineClass(double salary, double commission, int age, int elevel, int car, int zipcode, double hvalue, int hyears, double loan) pega os atributos que serão utilizados através de uma regra definida no código de quais classes cada instancia fará parte.

Functions:
// function 1
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    return ((age < 40) || (60 <= age)) ? 0 : 1;
}
idade < 40 ou idade <= 60 faz parte da classe 1 na função 1

// function 2
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    if (age < 40) {
        return ((50000 <= salary) && (salary <= 100000)) ? 0
                : 1;
    } else if (age < 60) {// && age >= 40
        return ((75000 <= salary) && (salary <= 125000)) ? 0
                : 1;
    } else {// age >= 60
        return ((25000 <= salary) && (salary <= 75000)) ? 0 : 1;
    }
}


// function 3
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    if (age < 40) {
        return ((elevel == 0) || (elevel == 1)) ? 0 : 1;
    } else if (age < 60) { // && age >= 40
        return ((elevel == 1) || (elevel == 2) || (elevel == 3)) ? 0
                : 1;
    } else { // age >= 60
        return ((elevel == 2) || (elevel == 3) || (elevel == 4)) ? 0
                : 1;
    }
}


// function 4
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    if (age < 40) {
        if ((elevel == 0) || (elevel == 1)) {
            return ((25000 <= salary) && (salary <= 75000)) ? 0
                    : 1;
        }
        return ((50000 <= salary) && (salary <= 100000)) ? 0
                : 1;
    } else if (age < 60) {// && age >= 40
        if ((elevel == 1) || (elevel == 2) || (elevel == 3)) {
            return ((50000 <= salary) && (salary <= 100000)) ? 0
                    : 1;
        }
        return ((75000 <= salary) && (salary <= 125000)) ? 0
                : 1;
    } else {// age >= 60
        if ((elevel == 2) || (elevel == 3) || (elevel == 4)) {
            return ((50000 <= salary) && (salary <= 100000)) ? 0
                    : 1;
        }
        return ((25000 <= salary) && (salary <= 75000)) ? 0 : 1;
    }
}


// function 5
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    if (age < 40) {
        if ((50000 <= salary) && (salary <= 100000)) {
            return ((100000 <= loan) && (loan <= 300000)) ? 0
                    : 1;
        }
        return ((200000 <= loan) && (loan <= 400000)) ? 0 : 1;
    } else if (age < 60) {// && age >= 40
        if ((75000 <= salary) && (salary <= 125000)) {
            return ((200000 <= loan) && (loan <= 400000)) ? 0
                    : 1;
        }
        return ((300000 <= loan) && (loan <= 500000)) ? 0 : 1;
    } else {// age >= 60
        if ((25000 <= salary) && (salary <= 75000)) {
            return ((300000 <= loan) && (loan <= 500000)) ? 0
                    : 1;
        }
        return ((100000 <= loan) && (loan <= 300000)) ? 0 : 1;
    }
}


// function 6
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    double totalSalary = salary + commission;
    if (age < 40) {
        return ((50000 <= totalSalary) && (totalSalary <= 100000)) ? 0
                : 1;
    } else if (age < 60) {// && age >= 40
        return ((75000 <= totalSalary) && (totalSalary <= 125000)) ? 0
                : 1;
    } else {// age >= 60
        return ((25000 <= totalSalary) && (totalSalary <= 75000)) ? 0
                : 1;
    }
}


// function 7
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    double disposable = (2.0 * (salary + commission) / 3.0
            - loan / 5.0 - 20000.0);
    return disposable > 0 ? 0 : 1;
}


// function 8
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    double disposable = (2.0 * (salary + commission) / 3.0
            - 5000.0 * elevel - 20000.0);
    return disposable > 0 ? 0 : 1;
}


// function 9
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    double disposable = (2.0 * (salary + commission) / 3.0
            - 5000.0 * elevel - loan / 5.0 - 10000.0);
    return disposable > 0 ? 0 : 1;
}


// function 10
@Override
public int determineClass(double salary, double commission,
        int age, int elevel, int car, int zipcode,
        double hvalue, int hyears, double loan) {
    double equity = 0.0;
    if (hyears >= 20) {
        equity = hvalue * (hyears - 20.0) / 10.0;
    }
    double disposable = (2.0 * (salary + commission) / 3.0
            - 5000.0 * elevel + equity / 5.0 - 10000.0);
    return disposable > 0 ? 0 : 1;
}