.class final Lia$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhp;

.field final synthetic b:Lhp;

.field final synthetic c:Z

.field final synthetic d:Lde;

.field final synthetic e:Landroid/view/View;

.field final synthetic f:Lic;

.field final synthetic g:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lhp;Lhp;ZLde;Landroid/view/View;Lic;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lia$3;->a:Lhp;

    iput-object p2, p0, Lia$3;->b:Lhp;

    iput-boolean p3, p0, Lia$3;->c:Z

    iput-object p4, p0, Lia$3;->d:Lde;

    iput-object p5, p0, Lia$3;->e:Landroid/view/View;

    iput-object p6, p0, Lia$3;->f:Lic;

    iput-object p7, p0, Lia$3;->g:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lia$3;->a:Lhp;

    iget-object v1, p0, Lia$3;->b:Lhp;

    iget-boolean v2, p0, Lia$3;->c:Z

    iget-object v3, p0, Lia$3;->d:Lde;

    invoke-static {v0, v1, v2, v3}, Lia;->a(Lhp;Lhp;ZLde;)V

    iget-object v0, p0, Lia$3;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lia$3;->e:Landroid/view/View;

    iget-object v1, p0, Lia$3;->g:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lic;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method
