import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class MyMain {

    private static class Options {
        @Option(name = "-h", aliases = { "help" }, usage = "Print usage")
        private boolean help;

        @Argument
        private List<String> puzzles = new ArrayList<String>();
    }

    private static void printUsage(CmdLineParser parser, CmdLineException e) {
        if(e != null) {
            System.err.println(e.getMessage());
        }
        System.err.println("[options...] puzzles...");
        parser.printUsage(System.err);
    }

    public static void main(String[] args) {
        Options opts = new Options();
        CmdLineParser parser = new CmdLineParser(opts);
        try {
            parser.parseArgument(args);
        } catch(CmdLineException e) {
            printUsage(parser, e);
            return;
        }
        if(opts.help) {
            printUsage(parser, null);
            return;
        }

        System.out.println("puzzles: " + opts.puzzles);

        String shortName = jtnoodle.getShortPuzzleName(jtnoodle.PUZZLE_333);
        String scramble = jtnoodle.generateScramble(jtnoodle.PUZZLE_333);
        System.out.println(shortName + " scramble: " + scramble);
    }
}
