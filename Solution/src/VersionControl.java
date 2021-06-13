public class VersionControl {
    int version;
    public VersionControl(){

    }
    public VersionControl(int version){
        this.version = version;
    }
    public boolean isBadVersion(int version){
         return version >= this.version;
    }
}
