.class public final Landroidx/appcompat/app/AlertController$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/core/widget/NestedScrollView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/AlertController$2;->c:Landroidx/appcompat/app/AlertController;

    iput-object p2, p0, Landroidx/appcompat/app/AlertController$2;->a:Landroid/view/View;

    iput-object p3, p0, Landroidx/appcompat/app/AlertController$2;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/core/widget/NestedScrollView;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/AlertController$2;->a:Landroid/view/View;

    iget-object v1, p0, Landroidx/appcompat/app/AlertController$2;->b:Landroid/view/View;

    invoke-static {p1, v0, v1}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
