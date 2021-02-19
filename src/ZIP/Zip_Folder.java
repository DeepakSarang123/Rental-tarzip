package ZIP;

import com.chilkatsoft.CkTar;

public class Zip_Folder {

    static {

        try {

            System.setProperty("java.library.path",
                    "C:\\Users\\40012385\\Documents\\dmp and tar\\chillkat\\chilkat-9.5.0-jdk8-win32\\chilkat.dll");

            System.loadLibrary("chilkat");

        } catch (UnsatisfiedLinkError e) {

            System.err.println("Native code library failed to load.\n" + e);

            System.exit(1);

        }

    }

    public static void main(String argv[])

    {

        // This example assumes the Chilkat API to have been previously unlocked.

        // See Global Unlock Sample for sample code.

        CkTar tar = new CkTar();

        // The TAR component will produce a GNU tar 1.13.x format

        // archive by default.

        // It is also possible to create PAX -- POSIX 1003.1-2001 format

        // or USTAR -- POSIX 1003.1-1988 format.

        // Set the WriteFormat property to "gnu", "pax", or "ustar" to

        // choose the output TAR format:

        tar.put_WriteFormat("gnu");

        // Add a directory tree to be included in the output TAR archive:

        boolean success = tar.AddDirRoot(
                "C:\\Users\\DEEPAK\\Documents\\dc26959e49007f1a6b86d2fa34517383ee769e29_macB827EBF55071_dat2020-10-27-1.dmp");

        if (success != true) {

            System.out.println(tar.lastErrorText());

            return;

        }

        // Create the compressed TAR archive.

        // Note: You may use UNC paths, absolute, or relative paths.

        success = tar.WriteTarGz(
                "C:\\Users\\DEEPAK\\Documents\\Output\\dc26959e49007f1a6b86d2fa34517383ee769e29_macB827EBF55071_dat2020-10-27-10-56-23_boxrpi_modARMv7Processorrev4(v7l)_34fc5249-3c9c-4283-9928888e-75331231.dmp.tgz");

        if (success != true) {

            System.out.println(tar.lastErrorText());

            return;

        }

        System.out.println("Success.");

    }

}
