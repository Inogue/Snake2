import java.awt.EventQueue;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;

import kotlin.jvm.internal.Intrinsics;

@Metadata(
        mv = {1, 7, 1},
        k = 2,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "Snake2"}
)
final class MainKt {
    public static void main() {
        if (!Intrinsics.areEqual(System.out.charset(), StandardCharsets.UTF_8)) {
            System.setOut(new PrintStream((new FileOutputStream(FileDescriptor.out)), true, StandardCharsets.UTF_8));
        }


        EventQueue.invokeLater(null);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    MenuKt.showUI();
    }
}
