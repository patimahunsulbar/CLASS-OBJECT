import java.until.Stack
    public class main{
        public statis void main(String[] args){
            System.out.println("------Object Kelas Kotak");
            // membuat object dari class kotak
            kotak main=new kotak();
            //method setter kotak
            main.setpanjang(20.13);
            main.setlebar(5,45);
          
            //method getter kotak
            System.out.println("panjang:"+ main.getpanjang());
            System.out.println("lebar:"+ main.getlebar());
            System.out.println("luas:"+ main.getluas());
            System.out.println("keliling:"+ main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
            System.out.println("------Object Kelas Mahasiswa------");
            //membuat object dari class mahasiswa
            mahasiswa mahasiswa= new mahasiswa();
            mahasiswa.nama="fatimah";
            mahasiswa.nim="D0217019";
            mahasiswa.alamat="uluway";
            mahasiswa.golonganDarah=:"A";
            mahasiswa.status="mahasiswa";
            mahasiswa.tinggiBadan="146";
            mahasiswa.beratBadan="45";
            //method getter mahasiswa
         System.out.println("nama:"+ mahasiswa.getnama());
         System.out.println("nim:"+ mahasiswa.getnim());
         System.out.println("alamat:"+ mahasiswa.getalamat());
         System.out.println("golonganDarah:"+ mahasiswa.getgolonganDarah());
         System.out.println("tinggiBadan:"+ mahasiswa.gettinggiBadan());
         System.out.println("beratBadan:"+ mahasiswa.getberatBadan());

            System.out.println("------Object Kelas node------");
            //membuat object dari kelas node
            node node= new node();
            //method setter node
            node.label="AQUA";
            node.Value=1;
            
            //method getter node
            System.out.println("Nama Label:"+ node.getlabel());
            System.out.println("Jumlah Label :"+ node.getValue());
            System.out.println("------Object Kelas stack------");
            //membuat object dari class stack
            stack stack= new stack();
            stack.value[0]="fatimah";
            stack.value[1]="nur";
            stack.value[2]="yani";
            stack.value[3]="rafli";
            stack.setValueAt(4, "yani");
            //menampilkan stack
            for(int i=0;stack.value.lenght>=i;i++){System.out.println(stack.value[i]);};
        }
    }
     
 