
/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void testKeepOnlyBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    public static void testNegate() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }

    public static void testGrayScale() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayScale();
        beach.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("beach.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal() {
        Picture caterpillar = new Picture("beach.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    public static void testMirrorVerticalRightToLeft() {
        Picture caterpillar = new Picture("beach.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    public static void testMirrorArms() {
        Picture caterpillar = new Picture("snowman.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    public static void testMirrorGull() {
        Picture caterpillar = new Picture("seagull.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    public static void testCopy2() {
        Picture caterpillar = new Picture("beach.jpg");
        caterpillar.explore();
        caterpillar.copy2(caterpillar, 10, 10, 20, 20, 90, 90);
        caterpillar.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }
    
    public static void testMyCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.myCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
    // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
//    testNegate();
//    testGrayScale();
        //testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//      testMirrorHorizontal();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
        //testMirrorDiagonal();
//    testCollage();
        testMyCollage();
//        testCopy2();
//    testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
