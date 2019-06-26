package com.example.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public final class MyGridAdapter extends BaseAdapter {

    private final List<Item>mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public String[] mRecipeTitle = {
            "Ризотто",
            "Лазанья",
            "Пицца",
            "Министроне",
            "Капрезе",
            "Буйабес",
            "Утинная грудка",
            "Печенько!!!!",


    };

    public  String[] mDescriptionTXT = {

            " Ризотто - отличный вариант для обеда или ужина. Сложного в приготовлении нет ничего. Важно только правильно подобрать рис и не переварить его. Приготовление блюда займет у вас буквально 30 минут.",
            " Лазанья – традиционное блюдо Италии, напоминающее слоеный пирог. Для лазаньи используется мука из твердых сортов пшеницы, слои теста могут чередоваться с мясным фаршем, грибами или овощами с сочетании с соусом болоньез, верх посыпают сыром пармезан. Существуют и другие вариации этого блюда.",
            " Пицца – национальное итальянское блюдо, одно из наиболее популярных в мире. Всего в Италии насчитывается около двух тысяч различных видов пиццы. На сегодняшний день самыми популярными считаются «Маргарита», «Маринара» и «Четыре сезона».",
            " Суп Минестроне – классический итальянский суп, состоящий из свежих сезонных овощей. Их количество не ограничено, чем больше – тем лучше. Наваристый, густой необычайно красивый и вкусный суп является одним из наиболее распространенных блюд в Италии.",
            " Капрезе – легкая закуска, стала одним из национальных блюд Италии. Это блюдо является разновидностью антипасто, состоит из помидоров, моцареллы, оливкового масла и базилика. Комбинация цветов салата повторяет флаг Италии, возможно поэтому он так популярен в своей стране.",
            " Буйабес является традиционным блюдом марсельской кухни, происхождение которого идет из Древней Греции. Буйабес — своего рода рагу или суп из остатков рыбы, что принято есть с гренками из хлеба с чесноком или запеченной рыбой. В Марселе существует специальный “Устав буйабес” — рецепт, который гарантирует традиционный вкус этого блюда.",
            "Используя очень часто в кулинарии гусиную печень или готовя традиционное конфи, французы, видимо, забыли об остальных ее частях! Именно поэтому рецепт вкуснейшей утиной грудки был изобретен сравнительно недавно. По некоторым сведениям, впервые идея приготовления этого лакомства возникла у Андре Дагена, шеф-повара Отель дэ Франс в Оше (Жере) в 1965 году.",
            " Американское печенье —  узнаваемый в нашей стране рецепт. Все любители американских фильмов многократно видели, как этим печеньем лакомятся дети и взрослые в мелодрамах и комедиях",

    };

    public static final String[] Ingredients =

            {
                    " куриный бульон — 5,5 стакана, рис для ризотто — 360 г, белое сухое вино — 120 мл, лук — 1 шт., сливочное масло — 30 г, шампиньоны — 150 г, оливковое масло — 2 ст. л., пармезан — 120 г, шафран — 1 щепотка, соль — по вкусу, черный молотый перец — по вкусу.",
                    "фарш (говядина + свинина) 1 кг\n" +
                            "листы лазаньи 180-200 г\n" +
                            "помидоры 500 г\n" +
                            "морковь 150 г\n" +
                            "лук 200 г\n" +
                            "сыр 300 г\n" +
                            "сыр пармезан 50 г\n" +
                            "чеснок 3-4 зубчика",
                    " 60 гр. сыра Моцарелла 30 гр. соуса песто 30 гр. бекона или ветчины 5-6 шт. помидорчиков черри 1 ст.л. томатного соуса орегано",
                    " 100 г Корень сельдерея\n" +
                            "100 г Лук\n" +
                            "100 г Морковь\n" +
                            "100 г Кабачок\n" +
                            "100 г Баклажан\n" +
                            "Сельдерей (стебель)\n" +
                            "1 шт. Лавровый лист\n" +
                            "Душистый перец (несколько горошин)\n" +
                            "1 шт. Зубчик чеснока\n" +
                            "Соль (по вкусу)\n" +
                            "2 л Вода\n" +
                            "5 г Оливковое масло",
                    " 2 шт моцарелла\n" +
                            "1 шарик бальзамический уксус\n" +
                            "1 ст.л. оливковое масло\n" +
                            "1 ст.л. зелень базилика",
                    " Рыба (морская, идеальное соотношение - 5-6 видов. ...\n" +
                            "Кальмар — 200 г\n" +
                            "Креветки — 200 г\n" +
                            "Мидии — 100 г\n" +
                            "Гребешок — 100 г\n" +
                            "Лук репчатый — 2 шт\n" +
                            "Чеснок — 4-6 зуб.",
                    "4 утиные грудки\n" +
                            "соль\n" +
                            "1 ст. л. смеси «Пять специй»\n" +
                            "4 зубчика чеснока\n" +
                            "400 г брокколи\n" +
                            "75 мл белого сухого вина\n" +
                            "100 мл соевого соуса\n" +
                            "1 стручок острого красного перца (или по вкусу)\n" +
                            "кусочек имбиря размером с большой палец\n" +
                            "100 г зеленого горошка (размороженного)\n" +
                            "2 побега зеленого лука",
                    "2 стакана муки\n" +
                            "0.5 ч.л. соли\n" +
                            "0.5 ч.л. соды\n" +
                            "1.5 сткана сахара\n" +
                            "1 ст.л. ванильного сахара (или ванилин на кончике ножа\n" +
                            "1 яйцо\n" +
                            "1 желток\n" +
                            "150 г масла\n" +
                            "110 г горького шоколада\n",

            };




    public Integer[] mThumbIds = {


            R.drawable.risotto, R.drawable.lasagna, R.drawable.pizza, R.drawable.minestrone, //R.drawable.biscuit,
            R.drawable.caprese, R.drawable.soup, R.drawable.duck, /*R.drawable.recipe,*/ R.drawable.biscuit,


    };


    public MyGridAdapter(Context context){
        mInflater = LayoutInflater.from(context);



        mItems.add(new Item("Ризотто", R.drawable.risotto ) );  mItems.add(new Item("Лазанья", R.drawable.lasagna ) );
        mItems.add(new Item("Пицца", R.drawable.pizza ) );  mItems.add(new Item("Министроне", R.drawable.minestrone ) );
        mItems.add(new Item("Капрезе", R.drawable.caprese ) );  mItems.add(new Item("Буйабес", R.drawable.soup ) );
        mItems.add(new Item("Утинная грудка", R.drawable.duck ) );  mItems.add(new Item("Печенье", R.drawable.biscuit ) );



    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return mItems.get(i).drawableId;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;
        if (v==null){

            v= mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text,v.findViewById(R.id.text));
        }

        picture = (ImageView)v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);
        Item item = getItem(i);
        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;

    }

    private static class Item {
        public final String name;
        public final  int  drawableId;
        Item(String name, int drawableId){
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
