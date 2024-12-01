import package1.SamePackageClass;
import package2.DifferentPackageClass;
import package2.ChildClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Тестирование спецификаторов доступа:\n");
        
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.testAccess();
        
        System.out.println();
        
        DifferentPackageClass differentPackage = new DifferentPackageClass();
        differentPackage.testAccess();
        
        System.out.println();
        
        ChildClass child = new ChildClass();
        child.testAccess();
    }
}
