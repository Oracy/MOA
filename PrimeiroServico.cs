using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace PrimeiroServico
{
    /// <summary>
    /// Summary description for WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld(int num1, int num2)
        {
            List<String> list = new List<String>();
            if(num1 < num2){
                while (num2 > num1+1 && num2 != num1)
                {
                    list.Add((num1+1).ToString());
                    num1++;
                }
            }
            else{
                while (num2+1 < num1 && num1 != num2)
                {
                    list.Add((num2+1).ToString());
                    num2++;
                }
            }
            return string.Join(", ", list);
        }
    }
}





















using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace PrimeiroServico
{
    /// <summary>
    /// Summary description for WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

        [WebMethod]
        public List<int> HelloWorld(int num1, int num2)
        {
            List<int> list = new List<int>();
            if(num1 < num2){
                while (num2 > num1+1 && num2 != num1)
                {
                    list.Add((num1+1));
                    num1++;
                }
            }
            else{
                while (num2+1 < num1 && num1 != num2)
                {
                    list.Add((num2+1));
                    num2++;
                }
            }
            return list;
        }
    }
}

