namespace GeometryExample.Exercise2
{
    public class Lion : Base
    {
        public Lion(string name, int weight) : base(name, weight)
        {
        }

        public override void Show()
        {
            base.Show();
        }

        public override void SetMe(string name, int weight)
        {
            base.SetMe(name, weight);
        }
    }
}