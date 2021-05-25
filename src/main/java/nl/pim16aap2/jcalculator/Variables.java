package nl.pim16aap2.jcalculator;

import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Represents a set of name/value value pairs that together make up variable definitions (e.g. "x"=2.0).
 *
 * @author Pim
 */
class Variables
{
    private final List<String> names;
    private final double[] values;

    public Variables(final List<String> names, final double[] values)
    {
        if (names.size() != values.length)
            throw new IllegalArgumentException(
                String.format("Size of parameters %d does not match number of values %d!",
                              names.size(), values.length));
        this.names = Collections.unmodifiableList(names);
        this.values = values;
    }

    /**
     * Attempts to get the value associated with the name of a variable.
     *
     * @param name The name of the variable.
     * @return An {@link OptionalDouble} containing the value if one was found, otherwise {@link
     * OptionalDouble#empty()}.
     */
    public OptionalDouble getValue(final String name)
    {
        final int idx = names.indexOf(name);
        if (idx == -1)
            return OptionalDouble.empty();
        return OptionalDouble.of(values[idx]);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < values.length; ++idx)
            sb.append("[").append("\"").append(names.get(idx)).append("\": ").append(values[idx]).append("], ");
        final String ret = sb.length() > 2 ? sb.substring(0, sb.length() - 2) : sb.toString();
        return "Variables: {" + ret + "}";
    }
}
