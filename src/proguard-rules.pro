# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.blackraspberry.BlackRaspberry {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/blackraspberry/repack'
-flattenpackagehierarchy
-dontpreverify
