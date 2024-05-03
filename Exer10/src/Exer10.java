public class Exer10 {
    public static void main(String[] args) {
        Exer10 exer = new Exer10();
        exer.meeting(new Man(), new Woman(), new Man());
    }
    public void meeting(Person... ps){
        for(int i =0; i < ps.length; i++){
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Woman){
                Woman woman = (Woman)ps[i];
                woman.makeup();
            } else if (ps[i] instanceof Man) {
                Man man = (Man)ps[i];
                man.smoke();
            } System.out.println();
        }
    }
}
