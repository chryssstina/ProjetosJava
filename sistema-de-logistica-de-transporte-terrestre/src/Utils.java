public class Utils {

    public static void validaNull(String value)
    {
        if(value.equals(null) || value.trim().equals(""))
        {
            throw new IllegalArgumentException("Não é permitido valor vazio! Por favor, digite novamente");
        }
    }

    public static void validaNull(double value)
    {
        if(value <= 0.0)
        {
            throw new IllegalArgumentException("Valor menor ou igual a zero! Por favor, digite novamente");
        }
    }

    public static void validaNull(int value)
    {
        if(value <= 0)
        {
            throw new IllegalArgumentException("Valor menor ou igual a zero! Por favor, digite novamente");
        }
    }

    public static void validaMaiorQue(int value, int max)
    {
        if(value > max)
        {
            throw new IllegalArgumentException("Valor maior que o valor permitido! Por favor, digite novamente");
        }
    }

    public static void validaMenorQue(int value, int min)
    {
        if(value < min)
        {
            throw new IllegalArgumentException("Valor menor que o valor permitido! Por favor, digite novamente");
        }
    }

    public static void validaNull(Object object)
    {
        if(object.equals(null))
        {
            throw new IllegalArgumentException("Valor vazio! Por favor, digite novamente");
        }
    }

}
