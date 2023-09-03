package interfaces;

interface member {
    public void callBack();
}

class customer implements member {
    String name;

    customer(String name) {
        this.name = name;
    }

    public void callBack() {
        System.out.println("ok,I will visit");
    }

}

class store {
    member mem[] = new member[100];
    int count = 0;

    void register(member m) {
        mem[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callBack();
        }
    }
}

public class stdchallenge1 {
    public static void main(String[] args) {
        store s = new store();
        customer c1 = new customer("arpit");
        customer c2 = new customer("hoon");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
