import java.io.File;


public class ArchivosA {

	public static void main(String[] args) {
		File file=null;
		file= new File(".");
		int encontrado=0;
		
		String[] ficheros=null;
		ficheros=file.list();
		for(int i=0; i<ficheros.length; i++){
			boolean encon=false;
			int j=0;
				while(encon==false && j<ficheros[i].length()){
					if(ficheros[i].charAt(j)=='a'){
						System.out.println(ficheros[i]);
						encontrado ++;
						encon=true;
					}
					j++;
				}
			}
		if(encontrado==0){
			System.out.println("No hay archivos que contengan la letra a");
		}
	}

}
