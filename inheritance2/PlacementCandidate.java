package inheritance2;

public class PlacementCandidate extends Student {
          protected double classAttendance;
          protected double labAttandance;
          public PlacementCandidate(String name,int id,int hardwork,int taskComplete,double classAttendance, double labAttandance) {
                    super(name,id,hardwork,taskComplete);
                    this.classAttendance = classAttendance;
                    this.labAttandance = labAttandance;
          }

          public void evaluateCandidate(){
                    System.out.println("hardWorkScore: "+this.hardwork);
                    System.out.println("tasckComplete: "+this.taskcomplete+"/10");
                    System.out.println("ClassAttendance: "+this.classAttendance+"%");
                    System.out.println("LabAttendance: "+this.labAttandance+"%");
          }
          public void probility(){
                    double probility = ((hardwork*0.3)+(taskcomplete*5)+(classAttendance*0.2)+(labAttandance*0.2));
                    System.out.println(probility);
          }
          public void Eligiblity(){
                    if(hardwork>70 && taskcomplete>7 && classAttendance>75 && labAttandance>75){
                              System.out.println("you are elligible");
                    }
                    else{
                              System.out.println("you are not elligible");
                    }
          }
          
          

}
