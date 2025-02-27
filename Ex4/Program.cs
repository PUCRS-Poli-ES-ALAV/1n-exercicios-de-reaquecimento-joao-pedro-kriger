Console.Write(ReverseString("joao"));


string ReverseString(string str)
{
    if (str.Length <= 1)
    {
        return str;
    }
    
    return str[str.Length - 1] + ReverseString(str.Substring(0, str.Length - 1));
}